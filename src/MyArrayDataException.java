public class MyArrayDataException extends Exception {
    public int firstCoordinate;
    public int secondCoordinate;

    MyArrayDataException(int firstCoordinate, int secondCoordinate) {
        this.firstCoordinate=firstCoordinate;
        this.secondCoordinate=secondCoordinate;
    }
}
