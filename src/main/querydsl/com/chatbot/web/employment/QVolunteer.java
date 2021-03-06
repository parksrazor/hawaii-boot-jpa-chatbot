package com.chatbot.web.employment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVolunteer is a Querydsl query type for Volunteer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVolunteer extends EntityPathBase<Volunteer> {

    private static final long serialVersionUID = 1286142638L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVolunteer volunteer = new QVolunteer("volunteer");

    public final QWorkArticle article;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QWorkMember member;

    public final DateTimePath<java.time.LocalDateTime> volunteerDate = createDateTime("volunteerDate", java.time.LocalDateTime.class);

    public QVolunteer(String variable) {
        this(Volunteer.class, forVariable(variable), INITS);
    }

    public QVolunteer(Path<? extends Volunteer> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVolunteer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVolunteer(PathMetadata metadata, PathInits inits) {
        this(Volunteer.class, metadata, inits);
    }

    public QVolunteer(Class<? extends Volunteer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.article = inits.isInitialized("article") ? new QWorkArticle(forProperty("article")) : null;
        this.member = inits.isInitialized("member") ? new QWorkMember(forProperty("member")) : null;
    }

}

