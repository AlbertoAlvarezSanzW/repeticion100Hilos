public class Hilos extends Thread{
//************** Creación de Callback *****************
    Callback callback;
    public Hilos(Callback callback){
        this.callback = callback;
//*****************************************************
    }


    @Override
    public void run() {
        final int MAX = 5;
        final int sleep = 8000;
        String iterador = "";
        try{
            for (int i = 0; i < MAX; i++) {
                int time = (int) (Math.random() * (sleep - 1000 + 1) + 1000);
                sleep(time);
                iterador = getName()+" Ha dormido por un tiempo " + time;
                callback.acaba(iterador, (i + 1));
            }
        }catch (InterruptedException e){
            e.printStackTrace();

        }
        callback.finaliza();
    }
}
/*
dentro del try catch creamos un for dado que necesitamos la iteración de 5
cada iteración le estamos pasando una variable tiempo que es lo que el hilo estara dormido
luego imprimimos el hilo que esta ejecutando y lo que ha dormido.
 */