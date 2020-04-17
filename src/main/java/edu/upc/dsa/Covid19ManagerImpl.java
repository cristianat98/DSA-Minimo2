package edu.upc.dsa;

import edu.upc.dsa.models.brote;
import edu.upc.dsa.models.caso;
import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

public class Covid19ManagerImpl implements Covid19Manager {

    private static Covid19Manager instance;
    protected List<brote> brotes;
    final static Logger logger = Logger.getLogger(Covid19ManagerImpl.class);

    private Covid19ManagerImpl() {
        this.brotes = new LinkedList<>();
    }

    public static Covid19Manager getInstance() {
        if (instance == null) instance = new Covid19ManagerImpl();
        return instance;
    }

    public int size() {
        int ret = this.brotes.size();
        logger.info("size " + ret);

        return ret;
    }

    public brote addbrote(brote b) {
        logger.info("new Brote " + b);

        this.brotes.add(b);
        logger.info("new Brote added");
        return b;
    }

    public brote addbrote(String nombre) {
        return this.addbrote(new brote(nombre));
    }

    public brote getbrote(String name) {
        logger.info("getbrote(" + name + ")");

        for (brote b : this.brotes) {
            if (b.getName().equals(name)) {
                logger.info("getbrote(" + name + "): " + b);

                return b;
            }
        }

        logger.warn("not found " + name);
        return null;
    }

    public List<brote> allbrotes() {
        return this.brotes;
    }

    //@Override
    public brote addcasobrote(String name, caso c) {

        for (brote b : this.brotes) {
            if (b.getName().equals(name)) {
                b.addcaso(c);
                return b;
            }
        }

        logger.warn("not found " + name);
        return null;
    }

    @Override
    public List<caso> casosbrote(String brote) {
        for (brote b : this.brotes) {
            if (b.getName().equals(brote)) {
                logger.info("getbrote(" + brote + "): " + b);

                return b.allcasos();
            }
        }

        logger.warn("not found " + brote);
        return null;
    }

}
