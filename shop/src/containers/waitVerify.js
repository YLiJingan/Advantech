import React,{ Component } from 'react'
import { Layout,Row,Col } from 'antd'
import Side from '../components/SideBar'
import '../styles/sidebar.css'
import WaitVerify from "../components/WaitVerify";

class Verify extends Component{
    render () {
        return <Layout style={{ minHeight: '100vh' }} className="ant-layout-has-sider sideBgColor">
            <Side/>
            <WaitVerify/>
        </Layout>
    }
}


export default Verify