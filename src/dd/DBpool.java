package dd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.jdbc.pool.DataSource;  
import org.apache.tomcat.jdbc.pool.PoolProperties;  
public class DBpool {
	static Connection conn;			
	static Statement stmt;
	static ResultSet rs;
	public Connection getConn(){
		PoolProperties p = new PoolProperties();  //�ع������ʵ����  
        p.setUrl("jdbc:mysql://localhost:3306/booksmanage?useSSL=false"); //����url  
        p.setDriverClassName("com.mysql.jdbc.Driver");//��������  
        p.setUsername("root");//�����û���  
        p.setPassword("123");//��������  
        p.setJmxEnabled(true);//����java������չ�Ƿ���� �Ƿ�֧��JMX  
        p.setTestWhileIdle(false);//���ÿ����Ƿ����  ���ж������������״̬  
        p.setTestOnBorrow(true);//ȡ�����Ӷ�������Ч�Խ��м��    ��borrowһ����ʵ��ʱ���Ƿ���ǰ���гز��������Ϊtrue����õ��ĳ�ʵ�����ǿ��õģ�   
        p.setTestOnReturn(false);//���������Ƿ��з���  
        p.setValidationQuery("SELECT 1");//��֤������Ч�Եķ�ʽ���ⲽ����ʡ �����������  
        p.setValidationInterval(30000);//��֤���ʱ��  
        //timeBetweenEvictionRunsMillis �� minEvictableIdleTimeMillis��   
        //����������ϣ����Գ����������ӳ��е����Ӷ���  
        //��timeBetweenEvictionRunsMillis ����0ʱ��ÿ��timeBetweenEvictionRunsMillis ʱ�䣬  
        //�ͻ�����һ���̣߳�У�����ӳ�������ʱ�䳬��minEvictableIdleTimeMillis�����Ӷ���  
        p.setTimeBetweenEvictionRunsMillis(30000);   
        p.setMinEvictableIdleTimeMillis(30000);  
  
        p.setMaxActive(100);//���ӳ���󲢷�����     
        p.setInitialSize(10);//��ʼ�����ӳ�ʱ,�������Ӹ���  
        p.setMaxWait(10000);//��ʱ�ȴ�ʱ���Ժ���Ϊ��λ   
        p.setRemoveAbandonedTimeout(60);//��ʱʱ��(������Ϊ��λ)  
        p.setMaxIdle(100);// ������������   
        p.setMinIdle(10);//��С����������  
        p.setLogAbandoned(false); //�Ƿ����Զ����ճ�ʱ���ӵ�ʱ���ӡ���ӵĳ�ʱ����  
        p.setRemoveAbandoned(true);//�Ƿ��Զ����ճ�ʱ����  
          
        //�O��jdbc������  
        p.setJdbcInterceptors("org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;"+  
                              "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");  
        DataSource dataSource = new DataSource();//TOMCAT ������Դ  
        dataSource.setPoolProperties(p); //��������Դ��
        try {
			conn= dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}  
        return conn;
	}
	

}
