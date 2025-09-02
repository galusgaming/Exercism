class Darts {
    int score(double xOfDart, double yOfDart) {
        double radius = xOfDart*xOfDart+yOfDart*yOfDart;
        if(radius<=1){
            return 10;
        }else if(radius<=25){
            return 5;
        }else if(radius<=100){
            return 1;
        }else return 0;
    }
}
