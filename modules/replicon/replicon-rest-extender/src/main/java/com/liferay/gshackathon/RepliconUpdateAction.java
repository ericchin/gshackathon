package com.liferay.gshackathon;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@ApplicationPath("/replicon")
@Component(
	immediate = true, property = {"jaxrs.application=true"},
	service = Application.class
)
public class RepliconUpdateAction extends Application {

	private static final Log log = LogFactoryUtil.getLog(RepliconUpdateAction.class);

	@Override
	public Set<Object> getSingletons() {
		return Collections.singleton((Object)this);
	}

	@POST
	@Path("/update")
	@Produces("application/json")
	public String update(String json) throws Exception {
		JSONObject request = JSONFactoryUtil.createJSONObject(json);

		if (log.isDebugEnabled()) {
			log.debug("Receiving request: \n" + request.toString(2));
		}

		JSONObject response = JSONFactoryUtil.createJSONObject();

		response.put("version", "1.0");
		response.put("sessionAttributes", JSONFactoryUtil.createJSONArray());

		JSONObject responseJson = JSONFactoryUtil.createJSONObject();

		JSONObject outputSpeechJson = JSONFactoryUtil.createJSONObject();

		outputSpeechJson.put("type", "PlainText");
		outputSpeechJson.put("text", "Updated, thank you for being so kind and responsable");

		responseJson.put("outputSpeech", outputSpeechJson);

		JSONObject repromptJson = JSONFactoryUtil.createJSONObject();

		outputSpeechJson = JSONFactoryUtil.createJSONObject();

		outputSpeechJson.put("type", "PlainText");
		outputSpeechJson.put("text", (String)null);

		repromptJson.put("outputSpeech", outputSpeechJson);

		responseJson.put("reprompt", repromptJson);

		response.put("response", responseJson);

		response.put("shouldEndSession", true);

		if (log.isDebugEnabled()) {
			log.debug("Sending response: \n" + response.toString(2));
		}
		return response.toJSONString();
	}

	@GET
	@Path("/test")
	@Produces("application/json")
	public String test() {
		System.out.println("testing");
		return "{response: \"Updated, thank you for being so kind and responsable\"}";
	}
}