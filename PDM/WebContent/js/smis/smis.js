Ext.ns('com.smis');
Ext.define('com.smis.IndexViewport', {
	extend:'Ext.container.Viewport',
	layout:'border',
	 items: [{
	        region: 'north',
	        html: '<img src="images/smis/top.jpg"/>',
	        border: false
	        //margins: '0 0 5 0'
	    }, {
	        region: 'west',
	        collapsible: true,
	        title: 'Navigation',
	        border:true,
	        width: 150
	        // 这里通常可以使用 TreePanel 或者 AccordionLayout布局的导航菜单
	    }, {
	        region: 'south',
	        title: 'South Panel',
	        collapsible: true,
	        html: 'Information goes here',
	        split: true,
	        height: 100,
	        minHeight: 100
	    }, {
	        region: 'center',
	        xtype: 'tabpanel', // TabPanel本身没有title属性
	        activeTab: 0,      // 配置默认显示的激活面板
	        items: {
	            title: 'Default Tab',
	            html: 'The first tab\'s content. Others may be added dynamically'
	        }
	    }]
});