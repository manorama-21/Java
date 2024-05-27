public class Non_primitive{
        public static void main(String[] args) {
            // double a = 4.34456566655673456;
            // float b = 4.34456566655673456f;
            // System.out.println("double accepts: "+ a);
            // System.out.println("float accepts: "+ b);
    
    //<----------String---------->
    
        //     String a = "My Name";
        //     String b = "is Manorama";
        //     String c = "Saroj";
        //     String d = "from Allahabad";
        //     String e = "and I am a student of ADIT Allahabad";
        //     System.out.println(a + " " + b +" " + " " + c + " " + d + " " + e);
            // System.out.println(a.concat(b).concat(c).concat(d).concat(e));
            // System.out.println("String join (delimiter): " + String.join(" weds ","Taanu","Mannu"));
            // System.out.println("String join (delimiter): " + String.join(" $$ ",a,b,c,d,e));
            // System.out.println("replace  return in every place: " + e.replace("a" ,"@"));
            // System.out.println("replace return in one place: " + e.replaceFirst("a" ,"@"));
            // System.out.println("replaceAll return in every place: " + e.replaceAll("a" ,"@"));
    
    
    
            // String a = "    Hello world   ";
            // System.out.println("a :"+a);
            // System.out.println("a length :"+a.length());
            // System.out.println("a UpperCase :" +a.toUpperCase());
            // System.out.println("a LowerCase :" +a.toLowerCase());
            // System.out.println("a indexof (if character found):" +a.indexOf('l'));
            // System.out.println("a indexof (if character found give -1):" +a.indexOf('u'));
            // System.out.println(a.contains("e"));
            // System.out.println("a trim (remove space): "+a.trim());
            // System.out.println("a charAt: "+a.CharAt(0));
            // System.out.println("a endsWith (find space): "+a.endsWith("nam"));
    
    
    //<-----------------Array--------------->
    
            //   int[] x = {};
            //   int[] y = {1,2,3,4,5,6,7,8,9,10};
    
            //   System.out.println("x :"+x);
            //   System.out.println("y :"+y[4]);
            //   System.out.println("x length:"+x.length);
            //   System.out.println("y length:"+y.length);
              
    
             
            //   String[] z = {"anjali","vaishu","jyoti"};
            //   System.out.println("z :"+z);
            //   System.out.println("z index:"+z[2]);
            //   System.out.println("z length:"+z.length);
    
    
            //   int[] a1 = new int[10];
            //   a1[0] = 89;
            //   a1[3] = 5;
            //   a1[4] = 634;
            //   a1[9] = 7234;
    
            //   System.out.println(a1[0]);
            //   System.out.println(a1[1]);
            //   System.out.println(a1[2]);
            //   System.out.println(a1[3]);
            //   System.out.println(a1[4]);
    
            // int x1  = a1.length;
    
            // for(int counter=0; counter<x1; counter++){
            //     System.out.println(a1[counter]);
            // }
             
    
    // <---------- Multidimentional array ---------->
             
            //  int [][] = new int[3][3];
    
            int [][] a2= {{13,14,15},{25,26,27}};
            // System.out.println(a2[0][1]);
            // System.out.println(a2[1][1]);
            // System.out.println(a2[2][2]);
    
    
            for(int i=0; i<a2.length; i++){
                // System.out.println(a2[i]);
                for(int j=0; j<3; j++){
                    System.out.println(a2[i][j]);
                    }
            }
    

            // int [] a= {13,14,15},{25,26,27};
            // for(int i:a){
            //     System.out.println(i);
            // }
               
           
        }
    }