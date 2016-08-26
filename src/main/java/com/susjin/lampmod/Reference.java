package com.susjin.lampmod;

public class Reference {
	
	public static final String MOD_ID = "slp";
	public static final String NAME = "Lamp Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSION = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.susjin.lampmod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.susjin.lampmod.proxy.ServerProxy";
	
	public static enum LampItems {
		LAMPTOP("lamptop", "Itemlamptop"),
		LAMPBOT("lampbot", "Itemlampbot");
		
		
		private String unlocalizedName;
		private String registryName;
		
		LampItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	public static enum LampBlocks {
		GLOWINGBRICKS("glowingBricks", "BlockGlowingBricks"),
		LIGHT("light", "BlockLight"),
		LIGHTPROVIDER("lightprovider", "BlockLightProvider");
		
		private String unlocalizedName;
		private String registryName;
		
		LampBlocks(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
