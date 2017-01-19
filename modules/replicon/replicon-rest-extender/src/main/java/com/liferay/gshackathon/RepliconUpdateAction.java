package com.liferay.gshackathon;

import com.liferay.gs.hackathon.model.Replicon;
import com.liferay.gs.hackathon.service.RepliconLocalService;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.UserLocalService;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Thiago Moreira
 */
@ApplicationPath("/replicon")
@Component(
	immediate = true, property = {"jaxrs.application=true"},
	service = Application.class
)
public class RepliconUpdateAction extends Application {

	@Override
	public Set<Object> getSingletons() {
		return Collections.singleton((Object)this);
	}

	@Path("/users")
	@POST
	@Produces("application/json")
	public String getUsersCount(String json) throws Exception {
		JSONObject request = JSONFactoryUtil.createJSONObject(json);

		if (_log.isDebugEnabled()) {
			_log.debug("Receiving request: \n" + request.toString(2));
		}

		int userCount = _userLocalService.getUsersCount();

		JSONObject response = _generateResponse(
			"There are " + userCount + " users in the system.");

		if (_log.isDebugEnabled()) {
			_log.debug("Sending response: \n" + response.toString(2));
		}

		return response.toJSONString();
	}

	@GET
	@Path("/test")
	@Produces("application/json")
	public String test() {
		System.out.println("testing");
		return "{response: \"Updated, thank you for being so kind and " +
			"responsible\"}";
	}

	@Path("/update")
	@POST
	@Produces("application/json")
	public String update(String json) throws Exception {
		JSONObject request = JSONFactoryUtil.createJSONObject(json);

		if (_log.isDebugEnabled()) {
			_log.debug("Receiving request: \n" + request.toString(2));
		}

		Replicon replicon = _repliconLocalService.addRepliconProject(request);

		JSONObject response = _generateResponse(
			"There was an error with your command. Please try again");

		if (replicon != null) {
			response = _generateResponse(
				"Updated, thank you for being so kind and responsible. " +
					replicon.getProjectName() + " has been added");
		}

		if (_log.isDebugEnabled()) {
			_log.debug("Sending response: \n" + response.toString(2));
		}

		return response.toJSONString();
	}

	private JSONObject _generateResponse(String message) {
		JSONObject response = JSONFactoryUtil.createJSONObject();

		response.put("sessionAttributes", JSONFactoryUtil.createJSONArray());
		response.put("version", "1.0");

		JSONObject responseJson = JSONFactoryUtil.createJSONObject();

		JSONObject outputSpeechJson = JSONFactoryUtil.createJSONObject();

		outputSpeechJson.put("text", message);
		outputSpeechJson.put("type", "PlainText");

		responseJson.put("outputSpeech", outputSpeechJson);

		JSONObject repromptJson = JSONFactoryUtil.createJSONObject();

		outputSpeechJson = JSONFactoryUtil.createJSONObject();

		outputSpeechJson.put("text", (String)null);
		outputSpeechJson.put("type", "PlainText");

		repromptJson.put("outputSpeech", outputSpeechJson);

		responseJson.put("reprompt", repromptJson);

		response.put("response", responseJson);

		response.put("shouldEndSession", true);

		return response;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		RepliconUpdateAction.class);

	@Reference
	private RepliconLocalService _repliconLocalService;

	@Reference
	private UserLocalService _userLocalService;

}