


public class Principal implements Callback{

    final int maximo = 20;
    String iteracion1,iteracion2,iteracion3,iteracion4, iteracion5;
    int num = 0;
    public Principal(){
        for (int i = 0; i < maximo; i++){
            Hilos hilos = new Hilos(this);
            hilos.setName("El hilo: "+(i+1)+" :");
            hilos.start();
        }


    }

    @Override
    public void acaba(String acaba1, int iterador) {
        switch(iterador){
            case 1:
                iteracion1+=acaba1+"\n";
                break;
            case 2:
                iteracion2+=acaba1+"\n";
                break;
            case 3:
                iteracion3+=acaba1+"\n";
                break;
            case 4:
                iteracion4+=acaba1+"\n";
                break;
            case 5:
                iteracion5+=acaba1+"\n";
                break;
            default:
                break;
        }
    }

    @Override
    public void finaliza() {
        num++;
        if(num==maximo) {
            System.out.println("Iteración 1:\n" + iteracion1 + "\nIteración 2:\n" + iteracion2 + "\nIteración 3:\n" + iteracion3 +
                    "\nIteración 4:\n" + iteracion4 + "\nIteración 5:\n" + iteracion5);
        }
    }
}
