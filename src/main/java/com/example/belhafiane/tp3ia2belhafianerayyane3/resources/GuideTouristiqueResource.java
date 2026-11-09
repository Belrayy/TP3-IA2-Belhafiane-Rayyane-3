package com.example.belhafiane.tp3ia2belhafianerayyane3.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/guide")
public class GuideTouristiqueResource {

    /**
     * Retourne les informations touristiques d'une ville ou d'un pays.
     *
     * @param villeOuPays nom de la ville ou du pays
     * @return tableau JSON contenant le lieu demandé
     */
    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] endroitsDeVisite(
            @PathParam("ville_ou_pays") String villeOuPays) {

        return new String[]{villeOuPays};
    }
}
