package denoflionsx.PluginsforForestry.Config;

import denoflionsx.denLib.Config.Annotations.Comment;
import denoflionsx.denLib.Config.Annotations.Config;
import denoflionsx.denLib.Config.Annotations.Tunable;
import net.minecraftforge.common.Configuration;

public class PfFTuning {

    @Config
    public static Configuration config;

    public static int getInt(String s) {
        return Integer.valueOf(s);
    }

    public static boolean getBool(String s) {
        return s.equals("true");
    }

    @Tunable(category = "liquids")
    public static class Liquids {

        @Comment(comment = "If true liquids will take up 1 block id per.")
        public static String liquid_asBlock = String.valueOf(true);
    }

    @Tunable(category = "items", comment = "set id to 0 to disable")
    public static class Items {

        public static String barrel_ItemID = String.valueOf(4100);
        public static String barrel_capacity = String.valueOf(10000);
        @Comment(comment = "Liquids only consume one item or block id depending on mode.")
        public static String veggiejuice_ItemID = String.valueOf(4101);
        public static String liquidpeat_ItemID = String.valueOf(4102);
    }

    @Tunable(category = "blocks", comment = "set id to 0 to disable")
    public static class Blocks {

        @Comment(comment = "Liquids only consume one item or block id depending on mode.")
        public static String veggiejuice_BlockID = String.valueOf(3100);
        public static String liquidpeat_BlockID = String.valueOf(3101);
    }
}
