
public class Msg {

    public int src; //client: 0, proposer: 1, acceptor 2, learner 3;
    public int des;
    public int src_id;
    public int des_id;
    public int view_id;
    public String value;

    Msg(int src, int des, int src_id, int des_id, int view_id, String value) {
        this.src = src;
        this.des = des;
        this.src_id = src_id;
        this.des_id = des_id;
        this.view_id = view_id;
        this.value = value;
    }
}
