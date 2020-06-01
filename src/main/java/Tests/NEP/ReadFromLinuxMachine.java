package Tests.NEP;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFromLinuxMachine {


    @Test


    public static void RemoteScriptsExecute() throws Exception, JSchException {


        JSch jsch = new JSch();

        Session session;
        try {


            session = jsch.getSession("root", "192.168.90.116", 22);

            session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
            session.setConfig("StrictHostKeyChecking", "no"); // disable check for RSA key
            session.setPassword("slyb5391");
            session.connect();



            // create the execution channel over the session
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            // Set the command to execute on the channel and execute the command
            channelExec.setCommand("ls");
            channelExec.connect();


            InputStream in = channelExec.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


            int exitStatus = channelExec.getExitStatus();
            if (exitStatus > 0) {
                System.out.println("Remote script exec error! " + exitStatus);
            }


            session.disconnect();
        } catch (JSchException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Session setupSshSession() throws JSchException {
        Session session = new JSch().getSession("root", "192.168.90.116", 22);
        session.setPassword("slyb5391");
        session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
        session.setConfig("StrictHostKeyChecking", "no"); // disable check for RSA key

        return session;
    }

    }
