package by.shyrei.aircompany.entity;

import java.util.ArrayList;

/**
 * Project AirCompany
 * Created on 02.06.2017.
 * author Shyrei Uladzimir
 */
public class AirLine {

    private ArrayList<AbstractAircraft> airLineData = new ArrayList<>();

    public AirLine(){
    }

    public AirLine(ArrayList<AbstractAircraft> airLineData) {
        this.airLineData = airLineData;
    }

    public void addAircraft(AbstractAircraft abstractAircraft){
        airLineData.add(abstractAircraft);
    }

    public void removeAircraft(AbstractAircraft abstractAircraft) {
        airLineData.remove(abstractAircraft);
    }

    public ArrayList<AbstractAircraft> getAllAircraft(){
       return airLineData;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "airLineData=" + airLineData +
                '}';
    }
}
