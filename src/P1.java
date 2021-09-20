
public class P1 extends Thread{

    private JobController AB;
    private JobController BD;
    private JobController DE;
    private JobController EF;


    public P1(JobController c1, JobController c2, JobController c3, JobController c4) {
        this.AB = c1;
        this.BD = c2;
        this.DE = c3;
        this.EF = c4;
    }

    @Override
    public void run(){
        A();
        AB.jobDone();
        BD.isJobDone();
        D();
        DE.jobDone();
        EF.isJobDone();
        F();
    }

    public void A(){
        System.out.println("Tâche A");
    }

    public void D(){
        System.out.println("Tâche D");
    }

    public void F(){
        System.out.println("Tâche F");
    }
}
