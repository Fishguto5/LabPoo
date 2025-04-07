package abstract_class.proj_hospital;

import java.util.ArrayList;
import java.util.HashMap;

public class H implements InterfaceHospital {
    private final String name;
    private final  String address;
    private HashMap<String, String> mapEmploys = new HashMap<>();
    private ArrayList<String> listspecialist = new ArrayList<>();

    public H (String name, String address){
        this.name  = name;
        this.address = address;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAdress() {
        return address;
    }

    @Override
    public HashMap<String, String> getEmploys() {
        return mapEmploys;
    }

    @Override
    public ArrayList<String> getspecialist() {
        return listspecialist;
    }

    void addEmploy(String name, String doctorType){
        if(!listspecialist.contains(doctorType)){
            addSpecialty(doctorType);
        }
        mapEmploys.put(name,doctorType);
    }
    void addSpecialty (String specialty){
        if(!listspecialist.contains(specialty)){
            listspecialist.add(specialty);
        }

    }

    String returnSpecialist(String name){
        return mapEmploys.get(name);
    }
}
