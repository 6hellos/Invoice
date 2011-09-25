package models;

import java.util.Date;
import javax.persistence.*;
import play.db.jpa.*;

/**
 * Created by IntelliJ IDEA.
 * User: pdelmundo
 * Date: 9/24/11
 * Time: 10:18 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Invoice extends Model {
    public String invoiceNumber;

    public String dueDate;

    public double balanceDue;

    public String discountDueDate;

    public double discountAmount;

    public int annualFinanceCharge;

    public String status;

    public Boolean action;

    public Invoice(String invoiceNumber, String dueDate, double balanceDue, String discountDueDate, double discountAmount,
                   int annualFinanceCharge, String status, Boolean action) {
        this.invoiceNumber = invoiceNumber;
        this.dueDate = dueDate;
        this.balanceDue = balanceDue;
        this.discountDueDate = discountDueDate;
        this.discountAmount = discountAmount;
        this.annualFinanceCharge = annualFinanceCharge;
        this.status = status;
        this.action = action;
    }

}
