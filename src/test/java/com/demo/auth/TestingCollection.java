package com.demo.auth;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.CharAppender;

import java.util.*;


public class TestingCollection {



    public  static void main(String args[]){

//        List is an interface, and ArrayList is a class

//        To instantiate the List interface, we can use the following syntaxes:

//        List <data-type> list1= new ArrayList();
//        List <data-type> list2 = new LinkedList();
//        List <data-type> list3 = new Vector();
//        List <data-type> list4 = new Stack();

//        getVectorMethod();
//        getHashmapMethod();
//getComparableMethod();
getStreamTest();
System.exit(1);


//        The List extends the collection framework, comparatively ArrayList extends AbstractList class and implements the List interface

        List<String> al = new ArrayList<String>();

        // Adding elements using add() method
        // Custom input elements
        al.add("Geeks");
        al.add("for");
        al.add("Geeks");
        al.add(1,"test");

        System.out.println(al);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Geeks");
        arrayList.add("for");
        arrayList.add("Geeks");
        arrayList.add(1,"test");
        System.out.println(arrayList);


        int car[] = new int[2];
        car[0]=1;
        car[1]=2;
//        System.out.println(car); => [I@27bc2616
        System.out.println(car[0]);
        System.out.println(Arrays.toString(car));
//        car[2]=3;  =>  ArrayIndexOutOfBoundsException

        List<String> ids = new ArrayList<String>(
                Arrays.asList("PAN", "VOTER ID", "UID")
        );
        System.out.println(Arrays.asList("PAN", "VOTER ID", "UID"));




        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Geeks");
        arrayList1.add(1);
        arrayList1.add("Geeks");
        arrayList1.add(1,"test");
        System.out.println(arrayList1);

    }

    private static void getStreamTest() {

        String fileContent = "JavaScript";
      /*
        List<String> ignorences = Arrays.asList("JavaScript","4Aavascript","J#61v#61script","javascript");
       System.out.println(ignorences.stream().filter(s -> fileContent.indexOf(ignorences.get(0))=1).count());
        long counts = 0L;
        for (String match : ignorences) {
            if (fileContent.indexOf(match) != -1) {
                counts++;
            }
        }

        if (counts != 0) {
            System.out.println("BadRequestHttpException");
//            throw new BadRequestHttpException("4028");
        }*/


        List<String> ignorence = new ArrayList();
        ignorence.add("JavaScript");
        ignorence.add("4Aavascript");
        ignorence.add("J#61v#61script");
        ignorence.add("javascript");
        long count = ignorence.stream().filter(match -> fileContent.indexOf(match) != -1).count();
        count= ignorence.stream().filter(match -> fileContent.indexOf(match) != -1).count();
        System.out.println("count "+ count) ;

        if (count != 0) {
            System.out.println("BadRequestHttpException");
//            throw new BadRequestHttpException("4028");
        }



//        Learn Stream API
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        int result = 0;

        for(int i :values){
            result =result+i;
        }
        System.out.println("result " +result );

//When we add values one by one it takes 7 times to add values. so mutation happens
//        To be fast we need concurrency so we need to reduce mutation.

//        values.forEach(i -> result = result + i);
//        values.forEach(i -> result += i);

        result += values.stream().mapToInt(i -> i).sum();



    }


    private static void getComparableMethod() {

        System.out.println("****** Comparable Comparable vs Comparator ****** " );

//        Normal sort with Collections class using .sort method
        List<Integer> lapInt= Arrays.asList(9,3,17,2);
        Collections.sort(lapInt);
        System.out.println("Sort list of Integer " + lapInt);

        List<String> lapString = Arrays.asList("run","jump","swim");
        Collections.sort(lapString);
        System.out.println("Sort list of String " + lapString);

//        To sort object of different values like ram,price
//      Step 1 :  Laptop class need to implement comparable interface
//      Step 2 : when we implement Comparable interface we need to override compareTo method in Laptop class

        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("dell",16,800));
        laps.add(new Laptop("Apple",8,1200));
        laps.add(new Laptop("Acer",12,700));
        laps.add(new Laptop("HP",32,500));

//        now we can use Collections.sort
//        which field need to sort, we need to create logic in compareTo method
        Collections.sort(laps);
        Collections.reverse(laps);

        for(Laptop l : laps){
//            now we sort lap with Ram Size
            System.out.println("Laptop sorted with Ram Size : " + l);
        }

//        When we have Comparable why we need to go for Comparator interface
/*
        when our laptop class not implementing any interfrace like (comparable) and it will not have compareTo method also
        what we will do at this scenario? we cannot sort right? when we cannot change class also , so we can add additonal parameter to .sort method
*/

//        Comparator<Laptop> +1 swap , -1 dont swap
        Collections.sort(laps,new Laptops());
        System.out.println("laps Sorted with price  : " + laps);

        Collections.sort(laps,new Laptopswithname());
        System.out.println("laps Sorted with Ram  : " + laps);


        laps.sort(new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                int comparison = 0;
                comparison = o1.getBrand().compareTo(o2.getBrand());
                return comparison;
            }
        });
        System.out.println("With Brand name laps Sorted with Ram  : " + laps);

//        to compare with different values we dont need to create class for all
//        create anonymous class like below for comparator to comapre values

        Comparator<Laptop> comRam = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {

                if(o1.getRam() < o2.getRam())
                    return 1;
                else
                    return -1;

            }
        };

        Collections.sort(laps,comRam);
        System.out.println("laps Sorted with Ram desc : " + laps);


        Comparator<Laptop> comPrice = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {

                if(o1.getPrice() < o2.getPrice())
                    return 1;
                else
                    return -1;

            }
        };

        Collections.sort(laps,comPrice);
        System.out.println("laps Sorted with Price desc : " + laps);

//     Enhanced 1 :   lamda expression

        Comparator<Laptop> comPrice0 = (Laptop o1, Laptop o2)-> {
                if(o1.getPrice() < o2.getPrice())
                    return 1;
                else
                    return -1;
        };

        Collections.sort(laps,comPrice0);
        System.out.println("Enhanced 1 : laps Sorted with Price desc : " + laps);

//    Enhanced 2 :    lamda expression with ternary opreation

        Comparator<Laptop> comPrice1 =  (o1, o2) ->{
            return o1.getPrice() < o2.getPrice()?1:-1;
        };
        System.out.println("Enhanced 2:  laps Sorted with Price desc with lamda : " + laps);

//      Enhanced 3:   lamda expression with more short version

        Comparator<Laptop> comPrice2 =  (o1, o2) -> o1.getPrice() < o2.getPrice()?1:-1;
        Collections.sort(laps,comPrice2);
        System.out.println(" Enhanced 3: laps Sorted with Price desc with lamda : " + laps);


//      Enhanced 4:   lamda expression with further more short version

        Collections.sort(laps,(o1, o2) -> o1.getPrice() > o2.getPrice()?1:-1);
        System.out.println("Enhanced 4: laps Sorted with Price desc with lamda : " + laps);



    }

    private static void getHashmapMethod() {
        System.out.println("****** HashMap ****");

        Map mapO = new HashMap();
        mapO.put("name","subbha");
        mapO.put("name1","cm");
        System.out.println("keySet " + mapO.keySet());
        System.out.println("entrySet " + mapO.entrySet());

        for( Object m: mapO.keySet()){
            System.out.println("values " + mapO.get(m));
        }

        Map<String ,String> map = new HashMap<>();
        map.put("name","subbha");
        map.put("name1","cm");
        System.out.println("keySet " + map.keySet());
        System.out.println("entrySet " + map.entrySet());

        for( String m: map.keySet()){
            System.out.println("values " + map.get(m));
        }

    }

    private static void getVectorMethod() {
        System.out.println("****** Vector ****");


//        Vector is old and it is introduced in java 1.0
//        It is growable in nature. It will increase its size by 100%.
//         Vector is a type of list. It is same as ArrayList.
//        Vector is dynamic array we can increase. Increase size automatically.
//        Deafault capacity for vector 10.


        Vector vector = new Vector();

        // Adding elements using add() method
        // Custom input elements
        vector.add("Geeks");
        vector.add(1);
        vector.add("Geeks");
        vector.add(1,"test");

        System.out.println(vector.capacity());

        System.out.println(vector);
    }
}
