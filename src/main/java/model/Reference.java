package model;

import com.fasterxml.jackson.core.type.TypeReference;

public class Reference<T extends Model> {
    private final Object url;
    private final TypeReference<T> typeReference;

    public Reference(Object url, TypeReference<T> typeReference) {
        this.url = url;
        this.typeReference = typeReference;
    }

    public Object getUrl() {
        return url;
    }

    public TypeReference<T> getTypeReference() {
        return typeReference;
    }
}
