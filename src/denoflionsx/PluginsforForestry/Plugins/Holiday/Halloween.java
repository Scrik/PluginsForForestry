package denoflionsx.PluginsforForestry.Plugins.Holiday;

import denoflionsx.PluginsforForestry.API.Plugin.IPfFPlugin;
import denoflionsx.PluginsforForestry.Core.PfF;
import denoflionsx.PluginsforForestry.Lang.PfFTranslator;
import denoflionsx.PluginsforForestry.Plugins.LiquidRoundup.client.IconConstants;
import denoflionsx.denLib.NewConfig.ConfigField;
import java.util.Calendar;

public class Halloween implements IPfFPlugin {

    @ConfigField(category = "holiday")
    public static boolean forceHalloween = false;
    public static final DateObject date = new DateObject(Calendar.OCTOBER).setWholeMonth(true);

    @Override
    public void onPreLoad() {
        if (date.isValidDate() || forceHalloween) {
            IconConstants.woodenBucket = "holiday/wooden_bucket_spooky";
            PfFTranslator.instance.overrideKey("item.pff.woodenbucket.name", "item.pff.woodenbucket.halloween.name");
            PfF.Proxy.print("Halloween mode activated!");
        }
    }

    @Override
    public void onLoad() {
    }

    @Override
    public void onPostLoad() {
    }
}
