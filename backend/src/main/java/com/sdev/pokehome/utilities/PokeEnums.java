package com.sdev.pokehome.utilities;

import org.springframework.stereotype.Component;

@Component
public class PokeEnums {

    public enum Gender {
        MALE(0),
        FEMALE(1),
        GENDERLESS(255);

        private final int value;

        Gender(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Gender fromValue(int value) {
            for (Gender gender : Gender.values()) {
                if (gender.value == value) {
                    return gender;
                }
            }
            throw new IllegalArgumentException("Invalid Gender value: " + value);
        }
    }

    public enum Nature {
        HARDY(0),
        LONELY(1),
        BRAVE(2),
        ADAMANT(3),
        NAUGHTY(4),
        BOLD(5),
        DOCILE(6),
        RELAXED(7),
        IMPISH(8),
        LAX(9),
        TIMID(10),
        HASTY(11),
        SERIOUS(12),
        JOLLY(13),
        NAIVE(14),
        MODEST(15),
        MILD(16),
        QUIET(17),
        BASHFUL(18),
        RASH(19),
        CALM(20),
        GENTLE(21),
        SASSY(22),
        CAREFUL(23),
        QUIRKY(24);

        private final int value;

        Nature(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Nature fromValue(int value) {
            for (Nature nature : Nature.values()) {
                if (nature.value == value) {
                    return nature;
                }
            }
            throw new IllegalArgumentException("Invalid Nature value: " + value);
        }
    }

    public enum Language {
        JAPANESE(1),
        ENGLISH(2),
        FRENCH(3),
        ITALIAN(4),
        GERMAN(5),
        SPANISH(7);

        private final int value;

        Language(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Language fromValue(int value) {
            for (Language language : Language.values()) {
                if (language.value == value) {
                    return language;
                }
            }
            throw new IllegalArgumentException("Invalid Language value: " + value);
        }
    }

    public enum Ball {
        MASTER_BALL(1),
        ULTRA_BALL(2),
        GREAT_BALL(3),
        POKE_BALL(4),
        SAFARI_BALL(5),
        NET_BALL(6),
        DIVE_BALL(7),
        NEST_BALL(8),
        REPEAT_BALL(9),
        TIMER_BALL(10),
        LUXURY_BALL(11),
        PREMIER_BALL(12);

        private final int value;

        Ball(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Ball fromValue(int value) {
            for (Ball ball : Ball.values()) {
                if (ball.value == value) {
                    return ball;
                }
            }
            throw new IllegalArgumentException("Invalid Ball value: " + value);
        }
    }

    public enum TrainerGender {
        MALE(0),
        FEMALE(1);

        private final int value;

        TrainerGender(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static TrainerGender fromValue(int value) {
            for (TrainerGender gender : TrainerGender.values()) {
                if (gender.value == value) { // Corrigido de gender.gender para gender.value
                    return gender;
                }
            }
            throw new IllegalArgumentException("Valor inválido para TrainerGender: " + value);
        }
    }

    public enum Version {
        RUBY(1),
        SAPPHIRE(2),
        EMERALD(3),
        FIRERED(4),
        LEAFGREEN(5),
        COLOSSEUM(15),
        XD(16),
        DIAMOND(10),
        PEARL(11),
        PLATINUM(12),
        HEARTGOLD(7),
        SOULSILVER(8),
        BLACK(20),
        WHITE(21),
        BLACK2(22),
        WHITE2(23),
        X(24),
        Y(25),
        OMEGA_RUBY(26),
        ALPHA_SAPPHIRE(27),
        SUN(30),
        MOON(31),
        ULTRA_SUN(32),
        ULTRA_MOON(33),
        SWORD(44),
        SHIELD(45),
        BRILLIANT_DIAMOND(48),
        SHINING_PEARL(49),
        LEGENDS_ARCEUS(47),
        SCARLET(54),
        VIOLET(55);

        private final int value;

        Version(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Version fromValue(int value) {
            for (Version version : Version.values()) {
                if (version.value == value) {
                    return version;
                }
            }
            throw new IllegalArgumentException("Invalid Version value: " + value);
        }
    }
}
