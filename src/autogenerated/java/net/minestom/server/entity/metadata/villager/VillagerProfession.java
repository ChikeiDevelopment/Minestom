package net.minestom.server.entity.metadata.villager;

import java.util.List;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import net.minestom.server.raw_data.RawVillagerProfessionData;
import net.minestom.server.registry.Registry;
import net.minestom.server.utils.NamespaceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AUTOGENERATED by VillagerProfessionGenerator
 */
public class VillagerProfession implements Keyed {
    public static final VillagerProfession NONE = new VillagerProfession(NamespaceID.from("minecraft:none"), new RawVillagerProfessionData(() -> null));

    public static final VillagerProfession ARMORER = new VillagerProfession(NamespaceID.from("minecraft:armorer"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_armorer")));

    public static final VillagerProfession BUTCHER = new VillagerProfession(NamespaceID.from("minecraft:butcher"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_butcher")));

    public static final VillagerProfession CARTOGRAPHER = new VillagerProfession(NamespaceID.from("minecraft:cartographer"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_cartographer")));

    public static final VillagerProfession CLERIC = new VillagerProfession(NamespaceID.from("minecraft:cleric"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_cleric")));

    public static final VillagerProfession FARMER = new VillagerProfession(NamespaceID.from("minecraft:farmer"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_farmer")));

    public static final VillagerProfession FISHERMAN = new VillagerProfession(NamespaceID.from("minecraft:fisherman"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_fisherman")));

    public static final VillagerProfession FLETCHER = new VillagerProfession(NamespaceID.from("minecraft:fletcher"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_fletcher")));

    public static final VillagerProfession LEATHERWORKER = new VillagerProfession(NamespaceID.from("minecraft:leatherworker"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_leatherworker")));

    public static final VillagerProfession LIBRARIAN = new VillagerProfession(NamespaceID.from("minecraft:librarian"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_librarian")));

    public static final VillagerProfession MASON = new VillagerProfession(NamespaceID.from("minecraft:mason"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_mason")));

    public static final VillagerProfession NITWIT = new VillagerProfession(NamespaceID.from("minecraft:nitwit"), new RawVillagerProfessionData(() -> null));

    public static final VillagerProfession SHEPHERD = new VillagerProfession(NamespaceID.from("minecraft:shepherd"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_shepherd")));

    public static final VillagerProfession TOOLSMITH = new VillagerProfession(NamespaceID.from("minecraft:toolsmith"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_toolsmith")));

    public static final VillagerProfession WEAPONSMITH = new VillagerProfession(NamespaceID.from("minecraft:weaponsmith"), new RawVillagerProfessionData(() -> Registry.SOUND_EVENT_REGISTRY.get("minecraft:entity.villager.work_weaponsmith")));

    static {
        Registry.VILLAGER_PROFESSION_REGISTRY.register(NONE);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(ARMORER);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(BUTCHER);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(CARTOGRAPHER);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(CLERIC);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(FARMER);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(FISHERMAN);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(FLETCHER);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(LEATHERWORKER);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(LIBRARIAN);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(MASON);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(NITWIT);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(SHEPHERD);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(TOOLSMITH);
        Registry.VILLAGER_PROFESSION_REGISTRY.register(WEAPONSMITH);
    }

    @NotNull
    private final NamespaceID id;

    @NotNull
    private volatile RawVillagerProfessionData villagerProfessionData;

    protected VillagerProfession(@NotNull NamespaceID id,
            @NotNull RawVillagerProfessionData villagerProfessionData) {
        this.id = id;
        this.villagerProfessionData = villagerProfessionData;
    }

    @Override
    @NotNull
    public Key key() {
        return this.id;
    }

    @NotNull
    public NamespaceID getId() {
        return this.id;
    }

    @NotNull
    public final RawVillagerProfessionData getVillagerProfessionData() {
        return this.villagerProfessionData;
    }

    public final void setVillagerProfessionData(
            @NotNull RawVillagerProfessionData villagerProfessionData) {
        this.villagerProfessionData = villagerProfessionData;
    }

    public int getNumericalId() {
        return Registry.VILLAGER_PROFESSION_REGISTRY.getId(this);
    }

    @Nullable
    public static VillagerProfession fromId(int id) {
        return Registry.VILLAGER_PROFESSION_REGISTRY.get((short) id);
    }

    @NotNull
    public static VillagerProfession fromId(Key id) {
        return Registry.VILLAGER_PROFESSION_REGISTRY.get(id);
    }

    @NotNull
    @Override
    public String toString() {
        return "[" + this.id + "]";
    }

    @NotNull
    public static List<VillagerProfession> values() {
        return Registry.VILLAGER_PROFESSION_REGISTRY.values();
    }
}