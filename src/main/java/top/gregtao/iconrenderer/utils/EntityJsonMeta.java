package top.gregtao.iconrenderer.utils;

import com.google.gson.JsonObject;
import net.minecraft.world.entity.Entity;

public class EntityJsonMeta {
    public Entity entity;
    public String zhName;
    public String enName;
    public String regName;
    public String mod;
    public RenderType type;
    public String icon;
    public ImageHelper imageHelper;

    public EntityJsonMeta(Entity entity) {
        this.entity = entity;
        this.regName = entity.getType().getDefaultLootTable().toString();
        this.type = RenderType.Entity;
        this.imageHelper = new ImageHelper(this);
    }

    public JsonObject toJsonObject() {
        JsonObject result = new JsonObject();
        result.addProperty("name", this.zhName);
        result.addProperty("englishName", this.enName);
        result.addProperty("registerName", this.regName);
        result.addProperty("mod", this.mod);
        result.addProperty("type", this.type.toString());
        result.addProperty("Icon", this.icon);
        return result;
    }
}
