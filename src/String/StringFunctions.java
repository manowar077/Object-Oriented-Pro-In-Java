package String;

public class StringFunctions {
    static void main() {
        //empty-> length=0
        //blank or sirf spaces h string
        String str="";
        IO.println(str.length());
        IO.println(str.isEmpty());
        IO.println(str.isBlank());

        //to trmove trailing space
        String name="   manowar    ";
        String hyy = name.trim();
        IO.println(hyy);

        //uppercase & lowercase
        //substring-> extract any part
        String str6=" my name is md manowar alam";
        IO.println(str6.substring(3,7));

        IO.println(hyy.contains("manowar"));

        int num=5123;
        String str7=String.valueOf(num);
        IO.println(num+1);

        String namee="Rana Love bana";
        IO.println(namee.endsWith("rana"));
        IO.println(namee.startsWith("bana"));
    }
}
