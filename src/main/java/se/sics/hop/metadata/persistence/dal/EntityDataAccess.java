package se.sics.hop.metadata.persistence.dal;

import java.sql.SQLException;
import java.sql.SQLTransientException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh <kamal@sics.se>
 */
public abstract class EntityDataAccess {

  protected static Log log = LogFactory.getLog(EntityDataAccess.class);

  // TODO - Better error handling of SQL Exceptions
  protected void handleSQLException(SQLException ex) throws StorageException {
    if (ex instanceof SQLTransientException) {
      throw new StorageException(ex);
    }

    String code = ex.getSQLState().substring(0, 2);

    if (code.equals("01")) //Warning
    {
      log.warn(ex);
    } else if (code.equals("24")) //Invalid cursor state
    {
      return;
    } else if (code.equals("25") //Invalid Transaction State
            || code.equals("40")) //Transaction Rollback
    {
      throw new StorageException(ex);
    } else {
      SQLException inEx = ex.getNextException();
      if (inEx != null) {
        throw new RuntimeException(inEx);
      } else {
        throw new RuntimeException(ex);
      }
    }

  }
}
