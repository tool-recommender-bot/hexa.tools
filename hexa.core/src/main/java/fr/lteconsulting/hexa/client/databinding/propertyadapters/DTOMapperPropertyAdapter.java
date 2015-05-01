package fr.lteconsulting.hexa.client.databinding.propertyadapters;

import fr.lteconsulting.hexa.client.databinding.DTOMapper;

public class DTOMapperPropertyAdapter extends WriteOnlyPropertyAdapter
{
	Object destinationOfMapping;
	Object mapperResources = null;

	public DTOMapperPropertyAdapter( Object destinationOfMapping )
	{
		this.destinationOfMapping = destinationOfMapping;
	}

	@Override
	public void setValue( Object object )
	{
		if( mapperResources != null )
			DTOMapper.FreeMapping( mapperResources );

		if( object != null )
			mapperResources = DTOMapper.Map( object, destinationOfMapping );
	}
}
