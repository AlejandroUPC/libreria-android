package edu.upc.eetac.dsa.amartinez.libreria.api;

import java.util.HashMap;
import java.util.Map;

public class LibreriaRootAPI {

    private Map<String, Link> links;

    public LibreriaRootAPI() {
        links = new HashMap<String, Link>();
    }

    public Map<String, Link> getLinks() {
        return links;
    }

}