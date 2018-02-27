package joel.mcplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Mcplugin extends JavaPlugin {
	PluginDescriptionFile pdffile = getDescription();
	public String version = pdffile.getVersion();
	public String nombre = pdffile.getName();
	
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage(nombre+" El plugin esta activado");
	}
}
