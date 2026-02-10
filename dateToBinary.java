class dateToBinary {

    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            str.append(Integer.toBinaryString(n));

            if (i < arr.length - 1) {
                str.append("-");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        dateToBinary obj = new dateToBinary();

        String date = "2023-10-05";
        String result = obj.convertDateToBinary(date);

        System.out.println("Original Date : " + date);
        System.out.println("Binary Date   : " + result);
    }
}
