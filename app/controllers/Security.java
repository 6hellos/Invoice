package controllers;


import java.util.*;

import play.*;
import play.Play.*;
import play.mvc.*;

import java.util.*;

import javax.persistence.*;
import play.db.jpa.*;

import models.*;

/**
 * Created by IntelliJ IDEA.
 * User: pdelmundo
 * Date: 9/25/11
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Security extends Secure.Security {
    static boolean authenticate(String username, String password) {
        
        User user = User.find("byEmail", username).first();
        return user != null && user.password.equals(password);
    }
}
