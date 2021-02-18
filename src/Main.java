public class Main {
    public static void main(String[] args) {
        String[][] array =new String[][]{
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12,"},
                {"13","14","15","16"}
        };
        try {
            try {
                int result = checkAndSumArray(array);
                System.out.println(result);
            } catch (MySizeArrayException e) {
                System.out.println("Размер миссива превышен!");
            }
        } catch (MyArrayDataException e){
            System.out.println("Неожидаемый символ в значении массива!");
            System.out.println("Ошибка в ячейке: "+ (e.firstCoordinate+1) + " " + (e.secondCoordinate+1));
        }
    }
    public static int checkAndSumArray(String[][] array) throws MyArrayDataException,MySizeArrayException {
        int count =0;
        if (array.length !=4) {
            throw new MySizeArrayException();
        }
        for (int i=0;i<array.length;i++){
            if (array[i].length!=4){
                throw new MySizeArrayException();
            }
            for (int j=0;j<array[i].length;j++) {
                try {
                    count +=Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return count;
    }
}
