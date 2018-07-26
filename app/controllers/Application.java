package controllers;

import models.Bike;
import play.*;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result main(Html content){
        return ok(main.render(content));
    }

    public static Result index(){ return ok(index.render()); }

    public static Result home() {
        return ok(home.render());
    }

    public static Result products(){
        return ok(product.render());
    }

    public static Result promotions(){return ok(promotion.render()); }

    public static Result products2(){
        return ok(product2.render());
    }

    public static Result products3(){
        return ok(product3.render());
    }

    public static Result bikes(){
        Bike bi1 = new Bike();
        bi1.setId("MTB001");
        bi1.setName("Roscoe 6");
        bi1.setBrands("Trek");
        bi1.setPrices(35000);
        bi1.setAmounts(10);

        Bike bi2 = new Bike("MTB004","Roscoe 7 Women's","Trek",39599,5);
        Bike bi3 = new Bike("MTB007","Roscoe 8 Women's","Trek",45324,2);
        Bike bi4 = new Bike("MTB010","Stache 5","Trek",59037,10);
        Bike bi5 = new Bike("MTB012","Fuel EX 5 29","Trek",69267,3);
        Bike bi6 = new Bike("MTB022","Fuel EX 8 29","Trek",108867,9);

    return ok(views.html.bikes.render(bi1,bi2,bi3,bi4,bi5,bi6));
    }
}
