package controllers;


import java.util.*;

import play.*;
import play.Play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        List<Invoice> invoices = Invoice.findAll();

        render(invoices);
    }

}