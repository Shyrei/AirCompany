package by.shyrei.aircompany.entity;

import java.util.ArrayList;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLine {

    ArrayList<Aircraft> data = new ArrayList<Aircraft>();
    public void rub(){

    }

    public void add(Aircraft plane){
        data.add(plane);
    }

    public ArrayList<Aircraft> getAircraft(){
       return data;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "data=" + data +
                '}';
    }
}
