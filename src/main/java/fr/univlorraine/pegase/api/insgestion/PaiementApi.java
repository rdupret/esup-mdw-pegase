/*
 * INS Gestion V5
 * Il s'agit de l'API v5 de gestion - INS  __Apprenant :__ une personne qui a au moins une inscription validée dans Pegase.  __Inscription :__ se définit par une cible sur une période de mise en œuvre pour un apprenant. Une inscription peut prendre deux états : soit validée, soit annulée.  __Actualisation :__ permet de modifier les données liées à l’apprenant ou à l’inscription alors que la piste a déjà été payée ou validée.   __Gestion des erreurs :__   __200, 201 :__ opération effectuée   __400 :__ erreur de données sur les formats   __403 :__ accès refusé   __404 :__ contenu introuvable   __409 :__ donnée déjà existante   __500 :__ erreur serveur  # Changement majeur/cassant par rapport à V4  1. Suppression de `Inscription.noCandidat`.  1. Ajout de `VoeuBase.noCandidat` et `InscriptionComplete.noCandidat`.  1. Ajout de `VoeuBase.choisi`. 
 *
 * The version of the OpenAPI document: 20.0.0
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


import java.io.File;
import fr.univlorraine.pegase.model.insgestion.VoeuInscription;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaiementApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaiementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaiementApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for imprimerAttestationDePaiement
     * @param codeStructure Le code de l&#39;établissement (required)
     * @param codeApprenant Le code de l&#39;apprenant (required)
     * @param codeVoeu Le code du voeu (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Succès d&#39;impression de l&#39;attestation de paiement </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Attestation introuvable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imprimerAttestationDePaiementCall(String codeStructure, String codeApprenant, String codeVoeu, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/gestion/inscriptions/{codeStructure}/{codeApprenant}/{codeVoeu}/attestation-de-paiement/"
            .replaceAll("\\{" + "codeStructure" + "\\}", localVarApiClient.escapeString(codeStructure.toString()))
            .replaceAll("\\{" + "codeApprenant" + "\\}", localVarApiClient.escapeString(codeApprenant.toString()))
            .replaceAll("\\{" + "codeVoeu" + "\\}", localVarApiClient.escapeString(codeVoeu.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "idTokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call imprimerAttestationDePaiementValidateBeforeCall(String codeStructure, String codeApprenant, String codeVoeu, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'codeStructure' is set
        if (codeStructure == null) {
            throw new ApiException("Missing the required parameter 'codeStructure' when calling imprimerAttestationDePaiement(Async)");
        }
        
        // verify the required parameter 'codeApprenant' is set
        if (codeApprenant == null) {
            throw new ApiException("Missing the required parameter 'codeApprenant' when calling imprimerAttestationDePaiement(Async)");
        }
        
        // verify the required parameter 'codeVoeu' is set
        if (codeVoeu == null) {
            throw new ApiException("Missing the required parameter 'codeVoeu' when calling imprimerAttestationDePaiement(Async)");
        }
        

        okhttp3.Call localVarCall = imprimerAttestationDePaiementCall(codeStructure, codeApprenant, codeVoeu, _callback);
        return localVarCall;

    }

    /**
     * Impression de l&#39;attestation de paiement
     * Impression de l&#39;attestation de paiement
     * @param codeStructure Le code de l&#39;établissement (required)
     * @param codeApprenant Le code de l&#39;apprenant (required)
     * @param codeVoeu Le code du voeu (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Succès d&#39;impression de l&#39;attestation de paiement </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Attestation introuvable </td><td>  -  </td></tr>
     </table>
     */
    public File imprimerAttestationDePaiement(String codeStructure, String codeApprenant, String codeVoeu) throws ApiException {
        ApiResponse<File> localVarResp = imprimerAttestationDePaiementWithHttpInfo(codeStructure, codeApprenant, codeVoeu);
        return localVarResp.getData();
    }

    /**
     * Impression de l&#39;attestation de paiement
     * Impression de l&#39;attestation de paiement
     * @param codeStructure Le code de l&#39;établissement (required)
     * @param codeApprenant Le code de l&#39;apprenant (required)
     * @param codeVoeu Le code du voeu (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Succès d&#39;impression de l&#39;attestation de paiement </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Attestation introuvable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> imprimerAttestationDePaiementWithHttpInfo(String codeStructure, String codeApprenant, String codeVoeu) throws ApiException {
        okhttp3.Call localVarCall = imprimerAttestationDePaiementValidateBeforeCall(codeStructure, codeApprenant, codeVoeu, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Impression de l&#39;attestation de paiement (asynchronously)
     * Impression de l&#39;attestation de paiement
     * @param codeStructure Le code de l&#39;établissement (required)
     * @param codeApprenant Le code de l&#39;apprenant (required)
     * @param codeVoeu Le code du voeu (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Succès d&#39;impression de l&#39;attestation de paiement </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Attestation introuvable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call imprimerAttestationDePaiementAsync(String codeStructure, String codeApprenant, String codeVoeu, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = imprimerAttestationDePaiementValidateBeforeCall(codeStructure, codeApprenant, codeVoeu, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for validerPaiementVoeu
     * @param codeStructure Le code de l&#39;établissement (required)
     * @param codeApprenant Le code apprenant (required)
     * @param codeVoeu Le code du voeu (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Le paiement de l&#39;inscription est validé </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Voeu introuvable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validerPaiementVoeuCall(String codeStructure, String codeApprenant, String codeVoeu, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/gestion/inscriptions/{codeStructure}/{codeApprenant}/{codeVoeu}/validerPaiement"
            .replaceAll("\\{" + "codeStructure" + "\\}", localVarApiClient.escapeString(codeStructure.toString()))
            .replaceAll("\\{" + "codeApprenant" + "\\}", localVarApiClient.escapeString(codeApprenant.toString()))
            .replaceAll("\\{" + "codeVoeu" + "\\}", localVarApiClient.escapeString(codeVoeu.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "idTokenAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call validerPaiementVoeuValidateBeforeCall(String codeStructure, String codeApprenant, String codeVoeu, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'codeStructure' is set
        if (codeStructure == null) {
            throw new ApiException("Missing the required parameter 'codeStructure' when calling validerPaiementVoeu(Async)");
        }
        
        // verify the required parameter 'codeApprenant' is set
        if (codeApprenant == null) {
            throw new ApiException("Missing the required parameter 'codeApprenant' when calling validerPaiementVoeu(Async)");
        }
        
        // verify the required parameter 'codeVoeu' is set
        if (codeVoeu == null) {
            throw new ApiException("Missing the required parameter 'codeVoeu' when calling validerPaiementVoeu(Async)");
        }
        

        okhttp3.Call localVarCall = validerPaiementVoeuCall(codeStructure, codeApprenant, codeVoeu, _callback);
        return localVarCall;

    }

    /**
     * Valider le paiement de l&#39;inscription
     * Valider le paiement de l&#39;inscription (statutPaiement sous voeu)
     * @param codeStructure Le code de l&#39;établissement (required)
     * @param codeApprenant Le code apprenant (required)
     * @param codeVoeu Le code du voeu (required)
     * @return VoeuInscription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Le paiement de l&#39;inscription est validé </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Voeu introuvable </td><td>  -  </td></tr>
     </table>
     */
    public VoeuInscription validerPaiementVoeu(String codeStructure, String codeApprenant, String codeVoeu) throws ApiException {
        ApiResponse<VoeuInscription> localVarResp = validerPaiementVoeuWithHttpInfo(codeStructure, codeApprenant, codeVoeu);
        return localVarResp.getData();
    }

    /**
     * Valider le paiement de l&#39;inscription
     * Valider le paiement de l&#39;inscription (statutPaiement sous voeu)
     * @param codeStructure Le code de l&#39;établissement (required)
     * @param codeApprenant Le code apprenant (required)
     * @param codeVoeu Le code du voeu (required)
     * @return ApiResponse&lt;VoeuInscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Le paiement de l&#39;inscription est validé </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Voeu introuvable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VoeuInscription> validerPaiementVoeuWithHttpInfo(String codeStructure, String codeApprenant, String codeVoeu) throws ApiException {
        okhttp3.Call localVarCall = validerPaiementVoeuValidateBeforeCall(codeStructure, codeApprenant, codeVoeu, null);
        Type localVarReturnType = new TypeToken<VoeuInscription>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Valider le paiement de l&#39;inscription (asynchronously)
     * Valider le paiement de l&#39;inscription (statutPaiement sous voeu)
     * @param codeStructure Le code de l&#39;établissement (required)
     * @param codeApprenant Le code apprenant (required)
     * @param codeVoeu Le code du voeu (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Le paiement de l&#39;inscription est validé </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Accès refusé </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Voeu introuvable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call validerPaiementVoeuAsync(String codeStructure, String codeApprenant, String codeVoeu, final ApiCallback<VoeuInscription> _callback) throws ApiException {

        okhttp3.Call localVarCall = validerPaiementVoeuValidateBeforeCall(codeStructure, codeApprenant, codeVoeu, _callback);
        Type localVarReturnType = new TypeToken<VoeuInscription>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
