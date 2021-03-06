package no.robert.repository.fluenty;

import java.util.Collection;

import no.robert.methodref.MethodRef;

public class Where {

    public static <PROP> SinglePropertySpecifier<PROP> having(PROP property) {
        MethodRef methodRef = MethodRef.get();
        return new SinglePropertySpecifier<PROP>(methodRef, CriteriaPopulator.NO_OP);
    }

    public static <T> CollectionPropertySpecifier<T> having(Collection<T> property) {
        MethodRef methodRef = MethodRef.get();
        return new CollectionPropertySpecifier<T>(methodRef, CriteriaPopulator.NO_OP);
    }



}
