import SwiftUI
struct fragment_report_summary: View {
    
    var body: some View {
        VStack
        {
            List
            {
                HStack
                {
                    Button(action: {})
                    {
                        Text("Pie Chart")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.blue)
                    Button(action: {})
                    {
                        Text("Bar Chart")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.blue)
                }
                HStack
                {
                    Button(action: {})
                    {
                        Text("Line Chart")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.blue)
                    Button(action: {})
                    {
                        Text("Sheet")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.blue)
                }
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(.bottom,12)
            Text("Expenses for last 3 months")
                .frame(minWidth:0,maxWidth:.infinity)
                .font(.system(size: 16))
            ZStack()
            {
                Rectangle()
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:250,idealHeight:250)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(.bottom,12)
            ZStack()
            {
                List
                {
                    HStack
                    {
                        Text("Total Assets")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 18))
                        Text("$ 2,500")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 18))
                    }
                    HStack
                    {
                        Text("Total Liabilities")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 18))
                        Text("$ 2,700")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 18))
                    }
                    HStack
                    {
                        Text("Net Worth")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 18))
                        Text("$ -200")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 18))
                    }
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(10)
            }
            .frame(minWidth:0,maxWidth:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .padding(10)}}

struct fragment_report_summary_Previews: PreviewProvider {
    static var previews: some View {
        fragment_report_summary()
    }
}
