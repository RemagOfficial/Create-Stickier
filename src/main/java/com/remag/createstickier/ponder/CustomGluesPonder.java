package com.remag.createstickier.ponder;

import com.remag.createstickier.CreateStickier;
import com.remag.createstickier.item.ModItems;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;
import com.simibubi.create.infrastructure.ponder.AllPonderTags;
import com.simibubi.create.infrastructure.ponder.scenes.ChassisScenes;

public class CustomGluesPonder {

    static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(CreateStickier.MODID);

    public static void register() {
        // HELPER.addStoryBoard(ModItems.STICKIER_SUPERGLUE.getId(), ChassisScenes::superGlue, AllPonderTags.CONTRAPTION_ASSEMBLY);
    }
}
