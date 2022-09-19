package CarSystem;

public class GearSelector {

    /**
     * @brief Este metodo permite conocer la marcha a la que debe ir un vehiculo segun su velocidad actual.
     * @param speed la velocidad del vehiculo
     * @return la marcha a la que debe ir el vehiculo
     */
    public char determineGear(int speed){

        if(speed < 0){
            throw new IllegalArgumentException("Invalid speed value!");
        }
        else if(speed == 0){
            return 'N';
        }
        else if(speed < 30){
            return '1';
        }
        else if(speed < 55){
            return '2';
        }
        else if(speed < 80){
            return '3';
        }
        else if(speed < 100){
            return '4';
        }
        else if(speed < 130){
            return '5';
        }else{
            throw new IllegalArgumentException("Max speed exceeded!!");
        }

    }
}
