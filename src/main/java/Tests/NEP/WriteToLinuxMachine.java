package Tests.NEP;

import com.google.common.io.CharStreams;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import static java.util.Arrays.asList;

public class WriteToLinuxMachine {


    @Test



    public static class RunCommandViaSsh {

        private static final String SSH_HOST = "192.168.90.116";
        private static final String SSH_LOGIN = "root";
        private static final String SSH_PASSWORD = "slyb5391";

        public   void Test() throws JSchException {
            System.out.println(runCommand(""));
            System.out.println(runCommand(""));
        }

        private List<String> runCommand(String command) throws JSchException {
            Session session = setupSshSession();
            session.connect();

            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            try {
                channel.setCommand("rm TrustwaveEndpoint.exe");
                channel.setInputStream(null);
                InputStream output = channel.getInputStream();
                channel.connect();

                String result = CharStreams.toString(new InputStreamReader(output));
                return asList(result.split("\n"));

            } catch (JSchException | IOException e) {
                closeConnection(channel, session);
                throw new RuntimeException(e);

            } finally {
                closeConnection(channel, session);
            }
        }

        private  Session setupSshSession() throws JSchException {
            Session session = new JSch().getSession(SSH_LOGIN, SSH_HOST, 22);
            session.setPassword(SSH_PASSWORD);
            session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
            session.setConfig("StrictHostKeyChecking", "no"); // disable check for RSA key
            return session;
        }

        private void closeConnection(ChannelExec channel, Session session) {
            try {
                channel.disconnect();
            } catch (Exception ignored) {
            }
            session.disconnect();
        }
    }
}