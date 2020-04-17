package edu.upc.dsa;

import edu.upc.dsa.models.brote;
import edu.upc.dsa.models.caso;

import java.util.List;

public interface Covid19Manager {

    public brote getbrote(String name);
    public brote addbrote(String newbrote);
    public brote addbrote(brote b);
    public List<brote> allbrotes();
    public brote addcasobrote(String name, caso c);
    public List<caso> casosbrote (String brote);

    public int size();
}
