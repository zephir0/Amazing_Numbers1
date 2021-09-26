class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {

        StringBuilder stb = new StringBuilder();

        for(char i = 'A'; i <= 'Z'; i++ ){
            stb.append(i).append(" ");
        }
        return stb;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}