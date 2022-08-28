package qa.learning.DataManagement;

import java.io.FileInputStream;
import java.util.Properties;

import qa.learning.DataManagement.PropertyFileReader;

public class PropertyFileReader 
{

public static Properties prop;

	public static Properties fn_ReadPropertyFile()
	{
		try
		{
			//reading values from Property File
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("src/test/resources/Config.Properties");
			
			prop.load(ip);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return prop;
	}

	public String getReportConfigPath()
	{
		String reportConfigPath = PropertyFileReader.fn_ReadPropertyFile().getProperty("reportConfigpath");
		
		if(reportConfigPath!=null)
		return reportConfigPath;
		
		else
			throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

}

