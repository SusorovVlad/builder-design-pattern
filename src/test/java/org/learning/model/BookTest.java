package org.learning.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BookTest {

    private static final String TITLE = "In Search of Lost Time";
    private static final String DESCRIPTION = "In this first volume, Swann's Way, the narrator Marcel, " +
            "an aspiring writer, recalls his childhood when--in a now immortal moment " +
            "in literature--the taste of a madeleine cake dipped in tea unleashes a " +
            "torrent of memories about his family's country home in the town of Combray";
    private static final Long ISBN = 9781631490354L;

    @Test
    public void creation() {
        Book lostTime = Book.create(builder -> builder.withTitle(TITLE)
                .withDescription(DESCRIPTION)
                .withIsbn(ISBN));

        Assertions.assertThat(lostTime).hasFieldOrPropertyWithValue("title", TITLE)
                .hasFieldOrPropertyWithValue("description", DESCRIPTION)
                .hasFieldOrPropertyWithValue("isbn", ISBN);
    }
}
