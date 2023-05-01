class count_char_inString{
    public static void main(String[] args) {
        String s= "ram nam Satay hai ....";
        int size=s.length();
        int remove= s.replace("a","").length();
        int occurance=size-remove;
        System.out.println("the occurance of char a is "+ occurance);
    }
}
