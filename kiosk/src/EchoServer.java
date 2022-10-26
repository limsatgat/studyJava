import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class EchoServer {

    private static ServerSocket serverSocket;

    public List<Kiosk> kioskList = null;
    public String ROW_DELIMITER = "|";
    public String COL_DELIMITER = "^";

    public SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
    public Date initTime = null;

    public static void main(String[] args) {
        EchoServer server = new EchoServer();
        server.initData();

        try {
            serverSocket = new ServerSocket(1982);
            System.out.println("Wating Connect ..");

            Socket socket = serverSocket.accept();
            InetAddress inetaddr = socket.getInetAddress();
            System.out.println(inetaddr.getHostAddress() + " 로부터 접속했습니다.");

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String result = null;
            String message = null;
            while ((message = br.readLine()) != null) {
                System.out.println("클라이언트로부터 전송받은 문자열 : " + message);

                result = "정의되지 않은 요청입니다. [HELP] WAIT, CALL, ISSUE";
                if (message != null) {
                    if (message.startsWith("CALL")) {
                        result = server.getCallList("CALL2");

                    } else if (message.startsWith("WAIT")) {
                        result = server.getWaitList("WAIT2");

                    } else if (message.startsWith("ISSUE")) {
                        result = server.getIssued("ISSUE2", message);
                    }
                }

                System.out.println(result);
                pw.println(result);
                pw.flush();
            }

            pw.close();
            br.close();
            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private List<Kiosk> initData() {
        try {
            initTime = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.kioskList = new ArrayList<Kiosk>();

        Kiosk kiosk = new Kiosk();
        kiosk.setSeq(1);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.10.112");
        kiosk.setSection_nm("1층");
        kiosk.setBiz_cd("1");
        kiosk.setBiz_nm("처음오시는분");
        kiosk.setIssued_no("1001");
        kiosk.setWait_cnt("3");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(2);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.10.112");
        kiosk.setSection_nm("1층");
        kiosk.setBiz_cd("2");
        kiosk.setBiz_nm("접수/수납");
        kiosk.setIssued_no("2302");
        kiosk.setWait_cnt("4");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(3);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.10.112");
        kiosk.setSection_nm("1층");
        kiosk.setBiz_cd("2");
        kiosk.setBiz_nm("어르신창구");
        kiosk.setIssued_no("3029");
        kiosk.setWait_cnt("5");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(4);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.10.123");
        kiosk.setSection_nm("1층");
        kiosk.setBiz_cd("4");
        kiosk.setBiz_nm("제증명");
        kiosk.setIssued_no("4720");
        kiosk.setWait_cnt("2");

        kioskList.add(kiosk);
        kiosk = new Kiosk();
        kiosk.setSeq(5);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.10.123");
        kiosk.setSection_nm("1층");
        kiosk.setBiz_cd("5");
        kiosk.setBiz_nm("퇴원");
        kiosk.setIssued_no("5249");
        kiosk.setWait_cnt("0");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(6);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.10.123");
        kiosk.setSection_nm("1층");
        kiosk.setBiz_cd("6");
        kiosk.setBiz_nm("입원");
        kiosk.setIssued_no("6215");
        kiosk.setWait_cnt("1");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(7);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.10.123");
        kiosk.setSection_nm("1층");
        kiosk.setBiz_cd("7");
        kiosk.setBiz_nm("세부내역서");
        kiosk.setIssued_no("7748");
        kiosk.setWait_cnt("0");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(8);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.20.21");
        kiosk.setSection_nm("2층");
        kiosk.setBiz_cd("2");
        kiosk.setBiz_nm("접수/수납");
        kiosk.setIssued_no("8243");
        kiosk.setWait_cnt("4");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(9);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.20.21");
        kiosk.setSection_nm("2층");
        kiosk.setBiz_cd("3");
        kiosk.setBiz_nm("어르신창구");
        kiosk.setIssued_no("9129");
        kiosk.setWait_cnt("5");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(10);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.210.121");
        kiosk.setSection_nm("지하1층");
        kiosk.setBiz_cd("2");
        kiosk.setBiz_nm("접수/수납");
        kiosk.setIssued_no("10304");
        kiosk.setWait_cnt("1");
        kioskList.add(kiosk);

        kiosk = new Kiosk();
        kiosk.setSeq(11);
        kiosk.setHospital_cd("MCAREH01");
        kiosk.setSection_cd("10.10.210.121");
        kiosk.setSection_nm("지하1층");
        kiosk.setBiz_cd("3");
        kiosk.setBiz_nm("어르신창구");
        kiosk.setIssued_no("11032");
        kiosk.setWait_cnt("0");
        kioskList.add(kiosk);

        return kioskList;
    }

    private String getCallList(String apiName) {
        StringBuffer sb = new StringBuffer();

        Date now = null;
        try {
            now = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diff = initTime.getTime() - now.getTime();
        long sec = diff / 1000;
        int term = (int) Math.abs(sec/10);

        sb.append(apiName).append(ROW_DELIMITER);

        Kiosk kiosk;
        for (int n = 0, size = this.kioskList.size(); n < size ; n ++) {
            kiosk = kioskList.get(n);
            sb.append(kiosk.getSection_cd()).append(COL_DELIMITER);
            sb.append(kiosk.getBiz_cd()).append(COL_DELIMITER);
            sb.append(String.valueOf(Integer.parseInt(kiosk.getIssued_no()) + term));
            if (n < size -1) {
                sb.append(ROW_DELIMITER);
            }
        }

        return sb.toString();
    }

    private String getWaitList(String apiName) {
        StringBuffer sb = new StringBuffer();
        sb.append(apiName).append(ROW_DELIMITER);

        Kiosk kiosk;
        for (int n = 0, size = this.kioskList.size(); n < size ; n ++) {
            kiosk = kioskList.get(n);
            sb.append(kiosk.getWait_cnt());
            if (n < size -1) {
                sb.append(ROW_DELIMITER);
            }
        }

        return sb.toString();
    }

    private String getIssued(String apiName, String message) {
        StringBuffer sb = new StringBuffer();

        String[] temp = message.split("\\" + ROW_DELIMITER);
        System.out.println("사이즈 : " + temp.length);
        if (temp.length < 3) {
            return "[HELP] command|sectionCd|bizCd|patientId";
        }
        String sectionCd = temp[1];
        String bizCd = temp[2];
        String patientId = temp[3];
        // String patientName = temp[4];
        System.out.println("요청섹션 : " + sectionCd);
        System.out.println("요청업무: " + bizCd);

        Date now = null;
        try {
            now = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diff = now.getTime() - initTime.getTime();
        long sec = diff / 1000;
        int term = (int) Math.abs(sec/10);

        Kiosk kiosk;
        for (int n = 0, size = this.kioskList.size(); n < size ; n ++) {
            kiosk = kioskList.get(n);
            System.out.println(kiosk.toString());

            if (kiosk.getSection_cd().equals(sectionCd) && kiosk.getBiz_cd().equals(bizCd)) {
                sb.append(apiName).append(ROW_DELIMITER);
                sb.append(sectionCd).append(ROW_DELIMITER);
                sb.append(bizCd).append(ROW_DELIMITER);
                sb.append(patientId).append(ROW_DELIMITER);
                sb.append(String.valueOf((Integer.parseInt(kiosk.getIssued_no()) + term + Integer.parseInt(kiosk.getWait_cnt())) + 1)).append(ROW_DELIMITER);
            }
        }

        if (sb.length() == 0) {
            sb.append(apiName);
            sb.append(ROW_DELIMITER);
            sb.append(ROW_DELIMITER);
            sb.append(ROW_DELIMITER);
            sb.append(ROW_DELIMITER);
        }

        return sb.toString();
    }

    public class Kiosk {

        private int seq;

        private String hospital_cd;

        private String section_cd;

        private String section_nm;

        private String biz_cd;

        private String biz_nm;

        private String remark;

        private String create_date;

        private String update_date;

        private String issued_no;

        private String wait_cnt;

        public int getSeq() {
            return seq;
        }

        public void setSeq(int seq) {
            this.seq = seq;
        }

        public String getHospital_cd() {
            return hospital_cd;
        }

        public void setHospital_cd(String hospital_cd) {
            this.hospital_cd = hospital_cd;
        }

        public String getSection_cd() {
            return section_cd;
        }

        public void setSection_cd(String section_cd) {
            this.section_cd = section_cd;
        }

        public String getSection_nm() {
            return section_nm;
        }

        public void setSection_nm(String section_nm) {
            this.section_nm = section_nm;
        }

        public String getBiz_cd() {
            return biz_cd;
        }

        public void setBiz_cd(String biz_cd) {
            this.biz_cd = biz_cd;
        }

        public String getBiz_nm() {
            return biz_nm;
        }

        public void setBiz_nm(String biz_nm) {
            this.biz_nm = biz_nm;
        }

        public String getIssued_no() {
            return issued_no;
        }

        public void setIssued_no(String issued_no) {
            this.issued_no = issued_no;
        }

        public String getWait_cnt() {
            return wait_cnt;
        }

        public void setWait_cnt(String wait_cnt) {
            this.wait_cnt = wait_cnt;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }

        public String getUpdate_date() {
            return update_date;
        }

        public void setUpdate_date(String update_date) {
            this.update_date = update_date;
        }

        @Override
        public String toString() {
            return "Kiosk [seq=" + seq + ", hospital_cd=" + hospital_cd + ", section_cd=" + section_cd + ", section_nm="
                    + section_nm + ", biz_cd=" + biz_cd + ", biz_nm=" + biz_nm + ", remark=" + remark + ", create_date="
                    + create_date + ", update_date=" + update_date + ", issued_no=" + issued_no + ", wait_cnt="
                    + wait_cnt + "]";
        }

    }



}
