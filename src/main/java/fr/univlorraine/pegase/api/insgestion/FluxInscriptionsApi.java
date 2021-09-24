/*
 * INS Gestion V5
 * Il s'agit de l'API v5 de gestion - INS  __Apprenant :__ une personne qui a au moins une inscription validée dans Pegase.  __Inscription :__ se définit par une cible sur une période de mise en œuvre pour un apprenant. Une inscription peut prendre deux états : soit validée, soit annulée.  __Actualisation :__ permet de modifier les données liées à l’apprenant ou à l’inscription alors que la piste a déjà été payée ou validée.   __Gestion des erreurs :__   __200, 201 :__ opération effectuée   __400 :__ erreur de données sur les formats   __403 :__ accès refusé   __404 :__ contenu introuvable   __409 :__ donnée déjà existante   __500 :__ erreur serveur  # Changement majeur/cassant par rapport à V4  1. Suppression de `Inscription.noCandidat`.  1. Ajout de `VoeuBase.noCandidat` et `InscriptionComplete.noCandidat`.  1. Ajout de `VoeuBase.choisi`. 
 *
 * The version of the OpenAPI document: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.api.insgestion;

import fr.univlorraine.pegase.api.ApiCallback;
import fr.univlorraine.pegase.api.ApiClient;
import fr.univlorraine.pegase.api.ApiException;
import fr.univlorraine.pegase.api.ApiResponse;
import fr.univlorraine.pegase.api.Configuration;
import fr.univlorraine.pegase.api.Pair;
import fr.univlorraine.pegase.api.ProgressRequestBody;
import fr.univlorraine.pegase.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import fr.univlorraine.pegase.model.insgestion.VueInscription;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FluxInscriptionsApi {
    private ApiClient localVarApiClient;

    public FluxInscriptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FluxInscriptionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listerFluxInscriptions
     * @param depuis L&#39;horodatage de la dernière extraction. Les entrées modifiées ou créées depuis seront remontées. (optional)
     * @param photo Inclure la photo d&#39;identité binaire dans les réponses. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Données de la carte multi-services récupérées </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Flux introuvable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listerFluxInscriptionsCall(Long depuis, Boolean photo, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/gestion/flux-inscriptions/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (depuis != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depuis", depuis));
        }

        if (photo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("photo", photo));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "idTokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listerFluxInscriptionsValidateBeforeCall(Long depuis, Boolean photo, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listerFluxInscriptionsCall(depuis, photo, _callback);
        return localVarCall;

    }

    /**
     * Chercher les données de la carte multi-services permettant également de répondre au besoin du flux des comptes
     * Chercher les données de la carte multi-services permettant également de répondre au besoin du flux des comptes
     * @param depuis L&#39;horodatage de la dernière extraction. Les entrées modifiées ou créées depuis seront remontées. (optional)
     * @param photo Inclure la photo d&#39;identité binaire dans les réponses. (optional, default to false)
     * @return List&lt;VueInscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Données de la carte multi-services récupérées </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Flux introuvable </td><td>  -  </td></tr>
     </table>
     */
    public List<VueInscription> listerFluxInscriptions(Long depuis, Boolean photo) throws ApiException {
        ApiResponse<List<VueInscription>> localVarResp = listerFluxInscriptionsWithHttpInfo(depuis, photo);
        return localVarResp.getData();
    }

    /**
     * Chercher les données de la carte multi-services permettant également de répondre au besoin du flux des comptes
     * Chercher les données de la carte multi-services permettant également de répondre au besoin du flux des comptes
     * @param depuis L&#39;horodatage de la dernière extraction. Les entrées modifiées ou créées depuis seront remontées. (optional)
     * @param photo Inclure la photo d&#39;identité binaire dans les réponses. (optional, default to false)
     * @return ApiResponse&lt;List&lt;VueInscription&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Données de la carte multi-services récupérées </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Flux introuvable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<VueInscription>> listerFluxInscriptionsWithHttpInfo(Long depuis, Boolean photo) throws ApiException {
        okhttp3.Call localVarCall = listerFluxInscriptionsValidateBeforeCall(depuis, photo, null);
        Type localVarReturnType = new TypeToken<List<VueInscription>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Chercher les données de la carte multi-services permettant également de répondre au besoin du flux des comptes (asynchronously)
     * Chercher les données de la carte multi-services permettant également de répondre au besoin du flux des comptes
     * @param depuis L&#39;horodatage de la dernière extraction. Les entrées modifiées ou créées depuis seront remontées. (optional)
     * @param photo Inclure la photo d&#39;identité binaire dans les réponses. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Données de la carte multi-services récupérées </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Flux introuvable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listerFluxInscriptionsAsync(Long depuis, Boolean photo, final ApiCallback<List<VueInscription>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listerFluxInscriptionsValidateBeforeCall(depuis, photo, _callback);
        Type localVarReturnType = new TypeToken<List<VueInscription>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
