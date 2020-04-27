/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyGameFiles;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author scuba
 */
public class RandomNumberArrayList {

    Random random = new Random();
    int range;
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    int random_number;

    public RandomNumberArrayList(int range) {
        this.range = range;
    }

    public void create_arrayList() {
        for (int i = 0; i <= range - 1; i++) {
            arrayList.add(i);
        }
    }

    public int return_int(boolean print_number_bool) {
        int size = arrayList.size();
        //if you call this function with a zero, it crashes

        random_number = random.nextInt(arrayList.size());
        if(print_number_bool == true){
            System.out.println(arrayList.get(random_number));
        }

        return arrayList.get(random_number);
    }

    public void remove_int() {
        arrayList.remove(random_number);
    }
}
