package org.learning.model;

import java.util.Objects;
import java.util.function.Consumer;

public final class Book {

    private final String title;
    private final String description;
    private final Long isbn;

    private Book(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.isbn = builder.isbn;
    }

    public static Book create(Consumer<Builder> consumer) {
        Builder builder = new Builder();
        consumer.accept(builder);
        return builder.build();
    }

    public static class Builder {

        private String title;
        private String description;
        private Long isbn;

        public Builder withTitle(String title) {
            Objects.requireNonNull(title, "Title cannot be null.");
            this.title = title;
            return this;
        }

        public Builder withDescription(String description) {
            Objects.requireNonNull(description, "Description cannot be null.");
            this.description = description;
            return this;
        }

        public Builder withIsbn(Long isbn) {
            Objects.requireNonNull(isbn, "Isbn cannot be null.");
            this.isbn = isbn;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
