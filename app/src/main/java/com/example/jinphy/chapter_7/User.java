package com.example.jinphy.chapter_7;

/**
 * Created by jinphy on 2017/7/19.
 */


public class User {
    private final String firstName;
    private final String lastName;
    private final String gender;
    private final int  age;
    private final String phone;

    private User(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        gender = builder.gender;
        age = builder.age;
        phone = builder.phone;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * {@code com.example.jinphy.chapter_7.User} builder static inner class.
     */
    public static final class Builder {
        private String firstName;
        private String lastName;
        private String gender;
        private int age;
        private String phone;

        private Builder() {
        }

        /**
         * Sets the {@code firstName} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param firstName the {@code firstName} to set
         * @return a reference to this Builder
         */

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets the {@code lastName} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param lastName the {@code lastName} to set
         * @return a reference to this Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets the {@code gender} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param gender the {@code gender} to set
         * @return a reference to this Builder
         */
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Sets the {@code age} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param age the {@code age} to set
         * @return a reference to this Builder
         */
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        /**
         * Sets the {@code phone} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param phone the {@code phone} to set
         * @return a reference to this Builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Returns a {@code com.example.jinphy.chapter_7.User} built from the parameters previously set.
         *
         * @return a {@code com.example.jinphy.chapter_7.User} built with parameters of this {@code com.example.jinphy.chapter_7.User.Builder}
         */

        public User build() {
            return new User(this);
        }
    }
}
