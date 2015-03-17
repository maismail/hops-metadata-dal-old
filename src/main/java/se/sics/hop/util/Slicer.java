package se.sics.hop.util;

public class Slicer {

  public interface OperationHandler {

    public void handle(int startIndex, int endIndex) throws Exception;
  }

  public static void slice(final int total, final int sliceSize, OperationHandler op) throws Exception {
    if (total == 0) {
      return;
    }
    int numOfSlices;
    if (total <= sliceSize) {
      numOfSlices = 1;
    } else {
      numOfSlices = (int) Math.ceil(((double) total) / sliceSize);
    }
    for (int slice = 0; slice < numOfSlices; slice++) {
      int startIndex = slice * sliceSize;
      int endIndex = Math.min((slice + 1) * sliceSize, total);
      op.handle(startIndex, endIndex);
    }
  }
}
